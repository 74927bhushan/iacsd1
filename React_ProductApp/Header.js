import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Link } from 'react-router-dom';
function Header(){
    const element=
    <>
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">Navbar</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link as={Link} to="/Product">Home</Nav.Link>
            <Nav.Link as={Link} to="/Product">Product</Nav.Link>
            <Nav.Link as={Link} to="/Cart">Cart</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      </>
      return element;
}

export default Header;