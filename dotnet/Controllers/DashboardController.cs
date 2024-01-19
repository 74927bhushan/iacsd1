using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using EStoreWebApp.Models;

namespace EStoreWebApp.Controllers;

public class DashboardController : Controller
{

    [HttpGet]
    public IActionResult Profile()
    {
        return View();

    }

    [HttpGet]
    public IActionResult Charts()
    {
        return View();

    }

     
    
}
