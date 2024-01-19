using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using EStoreWebApp.Models;

namespace EStoreWebApp.Controllers;

public class ProductsController : Controller
{
    
    [HttpGet]
    public IActionResult Index()
    {
        return View();

    } 
}
