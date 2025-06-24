import React from 'react'

const Child = ({name,setName}) => {
    return (
        <div>
            <input type="text" placeholder="Enter your name" name={name} onChange={(e)=>setName(e.target.value)}/>
        </div>
    );
};

export default Child