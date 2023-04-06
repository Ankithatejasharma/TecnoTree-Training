import{BrowserRouter,Routes,Route} from "react-router-dom";
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './App.css';
import AddEdit from "./pages/AddEdit";
import Home from "./pages/Home";
import View from "./pages/View";

function App() {
  return (
    <BrowserRouter>
    <div className="App">
      <ToastContainer position='top-center'/>
      <Routes>
        <Route exact path="/" element={<Home/>}/>
        <Route path="/addAuthor" element={<AddEdit/>}/>
        <Route path="/update/:authid" element={<AddEdit/>}/>
        <Route path="/view/:authid" element={<View/>}/>
      </Routes>
    </div>
    </BrowserRouter>
    
  );
}

export default App;
