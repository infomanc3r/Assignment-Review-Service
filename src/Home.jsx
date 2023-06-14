import React, { useState } from "react";

export const Home = (props) => {

    function Card1() {
    return (
        <div className="card1gray">
            <div className="card-body-gray">
                <img src="card1-small-gray.png" alt="card"></img>
            </div>
        </div>
        );
    }

    function Card2() {
        return (
            <div className="card2gray">
                <div className="card-body-gray">
                    <img src="card2-small-gray.png" alt="card"></img>
                </div>
            </div>
            );
        }

    function Card3() {
        return (
            <div className="card3gray">
                <div className="card-body-gray">
                    <img src="card3-small-gray.png" alt="card"></img>
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
                    <button className="toLogin-button" onClick={() => props.onFormSwitch('login')}>Login or Register Here</button>
                </div>
            </div>
    )
}