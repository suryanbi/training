import React, { Component } from 'react'

export default class Content extends Component {

    constructor(props){
        super(props);
        this.state={
            likecount: 1, dislikescount:1
        }
    }
    

    handleClick = () => {
        console.log('handle click called');
        this.setState({likecount:this.state.likecount+1})
    }
    handleClick1 = () => {
        console.log('handle click called');
        this.setState({dislikescount:this.state.dislikescount+1})
    }
    
  render() {
    return (
      <div>
        <p>Parveen Call Taxi</p>
        <p><button onClick={this.handleClick} className='btn-btn-info'>+</button></p>
        <p>Likes:{this.state.likecount}</p>

        <p><button onClick={this.handleClick1} className='btn-btn-info'>-</button></p>
        <p>DisLikes:{this.state.dislikescount}</p>
      
      </div>

      
    )
  }
}
