const express=require("express");
var connection=require('../DB/dbconnect.js');

var myRouter = express.Router();
myRouter.get("/showAll",function(req,resp){
    connection.query("select * from games",(err,data,fields)=>{
        if(err)
        {
            resp.status(500).send("No Data Found");
        }
        else
        {
            resp.render("index",{gamesData:data})
        }
    })
});

myRouter.get("/AddGame",function(req,resp){
    resp.render("addGames")
})

myRouter.post("/AddGame",function(req,resp){
    connection.query("insert into games (gamename,gameprice) values (?,?)",[req.body.gamename,req.body.gameprice],(err,result)=>{
        if(err)
        {
            resp.status(500).send("cannot insert the data");
        }
        else
        {
            resp.redirect("/showAll")
        }
    })
})
myRouter.get("/deleteGame/:gameid",function(req,resp){
  
    connection.query("delete from games where gameid=?",[req.params.gameid],(err,result)=>{
        if(err)
        {
            resp.status(500).send("cannot delete the data");
        }
        else
        {
            console.log("game deleted sucessfully");
            resp.redirect("/showAll")
        }
    })
})

myRouter.get("/updateGame/:gameid",function(req,resp){
    resp.render("updateGames");

})
myRouter.post("/updateGames",function(req,resp){
    connection.query("update games set gamename=?,gameprice=? where gameid=?",[req.body.gamename,req.body.gameprice,req.body.gameid],(err,result)=>
    {
        if(err)
        {
            resp.status(500).send("cannot update the data");
            resp.redirect("showAll");
        }
        else
        {
            console.log("game updated sucessfully");
            resp.redirect("/showAll")
        }
    })
})
 module.exports= myRouter;
