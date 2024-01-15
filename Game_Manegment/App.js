const express=require("express");
const app=express();
const path=require("path");
const bodyparser=require("body-parser");
const routes=require("./DBRoutes/routes");

app.set("Views",path.join(__dirname,"Views"))
app.set("view engine","ejs")

app.use(bodyparser.urlencoded({extended:false}));
app.use("/",routes);

app.listen(9000,function(){
    console.log("server started at port 9000");
});

module.exports=app;

