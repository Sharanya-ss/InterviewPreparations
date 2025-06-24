
import {useEffect, useRef,useState} from 'react'

const Parent = () => {

useEffect(() => {
    const fetchvalues = async () => {
        const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
        const data = await response.json();
        console.log(data.data);
    };
    fetchvalues();
}, []);

const [name, setName] = useState("");  
const inputRef = useRef(null);

return (
    <form onSubmit={(e)=>e.preventDefault()}>
        <label htmlFor="nameInput">Name:</label>
        <input id="nameInput" type="text" value={name} onChange={(e)=>setName(e.target.value)} ref={inputRef}/>
        <input type="button" value="press" onClick  ={() => {inputRef.current.focus();setName("")}} />
    </form>
);
}

export default Parent