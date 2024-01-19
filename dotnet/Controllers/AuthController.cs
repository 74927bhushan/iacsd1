using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using EStoreWebApp.Models;
using HRAPP.Entities;

namespace EStoreWebApp.Controllers;

public class AuthController : Controller
{


    [HttpGet]
    public IActionResult SignIn()
    {
        return View();

    }

    [HttpPost]
    public IActionResult SignIn(string uname, string psw)
    {
        if(uname=="ravi" && psw=="seed"){
          return RedirectToAction("Bar","Dashboard",null);
        }
        return View();
    }

    public IActionResult Register()
    {
        return View();
    }
     

     [HttpPost]
    public IActionResult Register(IFormCollection form)
    {
        //This is one way
        /* string id=this.HttpContext.Request.Form["Id"] ;
        string name=HttpContext.Request.Form["Name"];
        */
        //This is another way
        var id = form["Id"].ToString();
        var name = form["Name"].ToString();
       Console.WriteLine(id + "  "+ name);
       return RedirectToAction("SignIn","Auth",null);
    }

    public IActionResult ChangePassword(){
        return View();
    }
}
