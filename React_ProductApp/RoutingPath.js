import { Route, Routes } from "react-router-dom";
import ProductRoot from "./ProductRoot";
import Cart from './Cart'

function RoutingPath(){
    const element = 
    <Routes>
        <Route path="Home" element={<ProductRoot/>}/>
        <Route path="Product" element={<ProductRoot/>}/>
        <Route path="Cart" element={<Cart/>}/>
    </Routes>
    return element;
}
export default RoutingPath;