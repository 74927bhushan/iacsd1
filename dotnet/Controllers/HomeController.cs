using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using EStoreWebApp.Models;
namespace EStoreWebApp.Controllers;
public class HomeController : Controller
{
    //HTTP Incomming WebRequest
    //Action Methods
    //Depends on Request Type

    public HomeController(){
    Console.WriteLine("Home Controller Constructor is being invoked...");
    }
    [HttpGet]
    public IActionResult Index()
    {
         Console.WriteLine("Home Index Action Method is called...");
        return View();

    }
    public IActionResult Privacy()
    {
        return View();
    }

    public IActionResult Aboutus(){
           Console.WriteLine("Home  Aboutus  Action Method is called...");
        return View();
    }
    public IActionResult Contact(){

           Console.WriteLine("Home  Contact Action Method is called...");
        return View();

    }
    public IActionResult Services(){  
        return Json(new {Id=45, Name="Mentoring", Company="Transflower"});
    }



    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
