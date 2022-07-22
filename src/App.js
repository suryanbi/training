//import logo from './logo.svg';
import './App.css';
import { Header } from './Header';
import { Footer } from './Footer';
//import Content from './Content';
//import Article from './Article';
import { ContentAsFunction } from './ContentAsFunction';
//import { FetchData } from './FetchData';
import { CrudComponent } from './CrudComponent';
//import Article from './Article';
//import { NavBar } from './NavBar';

function App() {

  const emailLink = {"mail":'parveen@gmail.com',"text":'Adminstrator'}
  return (
    <div className="container">
      <div className='row'>
      
      <Header heading={'Parveen Taxi Service'}></Header>
      </div>
      <div className='row'>
         {/* <Article></Article>*/}
         <ContentAsFunction></ContentAsFunction>
         <CrudComponent></CrudComponent>
      </div>
      <div className='row'>
      <Footer designer={'Abc Corporation'} email={emailLink}></Footer>
      </div>
      
    </div>
  );
}

export default App;
