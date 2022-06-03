document.getElementById("submit-button").addEventListener("click",registerFunction);

async function registerFunction()
{
    let usern = document.getElementById("username").value;
    let userp = document.getElementById("password").value;   
    let roles = document.getElementById("Role").value;

    console.log(usern);
    console.log(userp);
    console.log(roles);
    //This is us making our user JSON object, so that we can send it to our database
    let user = {
        userName: usern,
        passWord: userp,
        role : roles
    }

    console.log(user);
    
    let response = await fetch("http://localhost:5000/employee",{
        method: "POST", //This is what we are doing, we are created an employee, so it is a post request
        body: JSON.stringify(user), //This will turn our user object into JSON we can send
        credentials: "include"
    });

    console.log(response);
}

