const express = require('express');
const f = require('fs');
const p = require('path');
const users1 =require('./MOCK_DATA_1.json');
// const users_by_email = require('./MOCK_DATA_1.json');
// const users_by_first_name=require('./MOCK_DATA_1.json');
// const users_by_last_name=require('./MOCK_DATA_1.json');
//const port=3000;
const port = 3030;
const app = express();
app.get('/',(req,res)=>{
    res.send("Hello From Express");
});
app.get('/users',(req,res)=>{
    res.json(users1);
});
app.get("/users/:id",(req,res)=>{
    const id = Number(req.params.id);
    const user = users1.find(
        user => user.id === id)
        return res.json(user);
    
});
app.get("/users/:id/:email",(req,res)=>{
    const id = Number(req.params.id);
    const email = req.params.email;
    const user = users1.find(
        user => user.id === id && user.email === email)
        return res.json(user);
});
app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);  
    const userIndex = users1.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = users1.splice(userIndex, 1);
    return res.json("Dae ");
});
app.get("/users_by_email/:email",(req,res)=>{
    const email = req.params.email;
    const user = users1.find(
        user=>user.email === email)
        return res.json(user);
});
app.get("/users_by_first_name/:first_name",(req,res)=>{
    const first_name = req.params.first_name;
    const user = users1.find(
        user=>user.first_name === first_name)
        return res.json(user);
});
app.get("/users_by_last_name/:last_name",(req,res)=>{
    const last_name = req.params.last_name;
    const user = users1.find(
        user=>user.last_name === last_name)
        return res.json(user);
});
app.use(express.urlencoded({ extended: false }))

app.post('/adduser', (req, res) => {
    const data = req.body;
    console.log("data " + data.email);
    users1.push(
        { data, id: users1.length + 1 });
    f.writeFile('./MOCK_DATA_1.json',
        JSON.stringify(users1), (err) => {
            console.log(err)
        });

    return res.json("data added ");
   

});
app.put('/users/:id', (req, res) => {
    const userId = parseInt(req.params.id);
    const updatedData = req.body;
    
    const userIndex = users1.findIndex(user => user.id === userId);

    if (userIndex === -1) {
        return res.status(404).json({ error: 'User not found' });
    }

    users1[userIndex] = { 
        ...users1[userIndex],
        ...updatedData
    };

    f.writeFile('./MOCK_DATA_1.json', JSON.stringify(users1), (err) => {
        if (err) {
            return res.status(500).json({ error: 'Failed to write to file' });
        }
    });

    return res.json({ 
        message: "User updated successfully", 
        user: users1[userIndex] 
    });
});
app.get('/aboutus', (req, res) => {
    const t = p.join(__dirname, 'aboutus.html');
    console.log(t);
    res.sendFile(t);
});
app.listen(port)
console.log("From Start Script");
