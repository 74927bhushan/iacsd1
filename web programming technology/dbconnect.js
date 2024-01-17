const mysql = require("mysql");

var connection = mysql.createConnection({
host:'localhost',
database:'bala',
user:'root',
password:'bala1889',
port:3306

});

connection.connect((err)=>{
    if(err){
        console.log("error occured");
    }
    else{
        console.log("connected succesfully");
    }
});

module.exports=connection;