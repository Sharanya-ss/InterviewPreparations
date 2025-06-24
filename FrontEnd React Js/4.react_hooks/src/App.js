import { useEffect } from 'react';
import './App.css';
import Parent from './components/Parent';

function App() {
  useEffect(() => {
    // This function will be called when the component is mounted
    // You can perform side effects here, like fetching data or setting up subscriptions 
    console.log("App component mounted");
    // This function will be called when the component is unmounted
    return () => {console.log("App component unmounted");};
  },[]);

  return (
    <div className="App">
      <Parent/>
    </div>
  );
}

export default App;
