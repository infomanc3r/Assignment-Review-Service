import React, { useState } from "react";
import logo from './logo.svg';
import './App.css';
import { Login } from "./Login";
import { Register } from "./Register";
import { Home } from "./Home";
import { LoggedIn } from "./LoggedIn";

function App() {
    const [currentForm, setCurrentForm] = useState('home');

    const toggleForm = (formName) => {
        setCurrentForm(formName);
    }

    return (
        <div className="App">
        {
            {
                'login': <Login onFormSwitch={toggleForm} />,
                'register': <Register onFormSwitch={toggleForm} />,
                'home': <Home onFormSwitch={toggleForm} />,
                'loggedin': <LoggedIn onFormSwitch={toggleForm} />

            }[currentForm]
        }
            <div className="Footer">
                <section>
                    <a
                    href="https://www.bloomtech.com/"
                    target='_blank'
                    rel="noopener"
                    aria-label='Bloomtech'>Bloomtech</a>
                </section>
                <section>
                    <a
                    href="https://www.bloomtech.com/contact-us"
                    target='_blank'
                    rel="noopener"
                    aria-label='Contact'>Contact Us</a>
                </section>
            </div>
        </div>
    );
}

export default App;
