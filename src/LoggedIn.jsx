import React, { useState } from "react";

export const LoggedIn = (props) => {

    function Card1() {
        return (
            <div className="card1">
                <div className="card-body">
                    <img src="card1-small.png" alt="card" onClick={() => props.onFormSwitch('home')}></img>
                </div>
            </div>
            );
    }

    function Card2() {
        return (
            <div className="card2">
                <div className="card-body">
                    <img src="card2-small.png" alt="card" onClick={() => props.onFormSwitch('home')}></img>
                </div>
            </div>
            );
        }

    function Card3() {
        return (
            <div className="card3">
                <div className="card-body">
                    <img src="card3-small.png" alt="card" onClick={() => props.onFormSwitch('home')}></img>
                </div>
            </div>
            );
        }
    return (
            <div className="home-container">
                <div className="banner-container">
                    Welcome to the Bloomtech Assignment Review App
                </div>
                <div className="card-container">
                    <Card1 />
                    <Card2 />
                    <Card3 />
                </div>
                <div className="button-container">
                    <button className="toDashboard-button" onClick={() => props.onFormSwitch('home')}>Proceed to Dashboard</button>
                </div>
            </div>
    )
}