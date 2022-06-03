document.getElementById("loginButton").addEventListener("click",loginFunction);


async function loginFunction()
{
    let usern = document.getElementById("username").value;
    let userp = document.getElementById("password").value;

    console.log(usern);
    console.log(userp);
    //This is us making our user JSON object, so that we can send it to our database
    let user = {
        userName: usern,
        passWord: userp
    }

    console.log(user);
    
    let response = await fetch("http://localhost:5000/login",{
        method: "POST", //This is what we are doing, we are created an employee, so it is a post request
        body: JSON.stringify(user), //This will turn our user object into JSON we can send
        credentials: "include"
    });

    console.log(response.status);

    if(response.status === 201){
        document.getElementById("loginRow").innerText = "Welcome to the Manager Menu!";
        window.location.href = "manager.html";
        window.location.href;
    }
    else if(response.status === 202){
        document.getElementById("loginRow").innerText = "Welcome to the Employee Menu!";
        window.location.href = "Employee.html";
        window.location.href;
    }
    else{
        document.getElementById("loginRow").innerText = "Login Failed, please refresh the page!";
    }
}
