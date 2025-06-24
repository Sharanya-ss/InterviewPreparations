import './App.css';
import { useState } from 'react';

function App() {
  const [name,setName]=useState();
  const [submittedName, setSubmittedName] = useState("");
  return (
    <div className="App">
      <form onSubmit={(e) => {e.preventDefault();setSubmittedName(name);}}>
      <input type="text" placeholder="Enter your name" value={name || ""} onChange={(e) => setName(e.target.value)} />
      <button type="submit">Submit</button>
      <input type="text" placeholder="see your entered name" value={submittedName} readOnly />
      </form>
    </div>
  );
}

export default App;
