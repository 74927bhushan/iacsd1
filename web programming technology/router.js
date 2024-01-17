const express = require("express");
const myrouter = express.Router();
var connection = require("../db/dbconnect");

myrouter.get("/", (req, resp) => {
    connection.query("select * from contactdb", (err, data, field) => {
        if (err) {
            console.log("error occured", err);
        } else {
            resp.render("index", { data: data });
            console.log("connection get the data");
        }
    });
});

myrouter.post("/", (req, resp) => {
    const { name, email, contact } = req.body;
    connection.query("insert into contactdb (name,email,contact) values (?,?,?)", [name, email, contact], (err, result) => {
        if (err) {
            console.log("err occured in  inserting");
        } else {
            resp.redirect('/');
        }
    });
});

myrouter.post("/delete/:id",function(req,resp){
    const contactId= req.params.id;

    connection.query("delete from contactdb where id=?",[contactId],(err,result)=>{
        if(err){
            console.log("error deleting contact",err);
            resp.status(500).send("error deleting contact");
        }else{
            console.log("contact deleted sucessfully");
            resp.redirect("/");
        }
    });
});

module.exports = myrouter;
