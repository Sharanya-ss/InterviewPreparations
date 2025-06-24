import React from 'react'
import Child from './Child'

const Parent = ({name,setName}) => {
    return (
        <div>
                <label>{name}</label>
                <Child name={name} setName={setName}/>
        </div>
    )
}

export default Parent