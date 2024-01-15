const mysql=require("mysql");

var mysqlConnection = mysql.createConnection({
    host:'127.0.0.1',
    user:'root',
    password:'bala1889',
    database:'bala',
    port:'3306'
})

mysqlConnection.connect((err)=>{
    if(!err)
    {
        console.log("connection -----created");
    }
    else{
        console.log("error in connection");
    }
})

module.exports=mysqlConnection;