import './App.css';
import  Parent from './components/Parent';
import {useState} from 'react';

function App() {
  const [name, setName] = useState("Priyanka");
  return (
    <div className="App-header">
      <Parent name={name} setName={setName}/>
    </div>
  );
}

export default App;
