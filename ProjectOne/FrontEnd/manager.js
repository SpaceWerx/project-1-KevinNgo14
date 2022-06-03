document.getElementById("view-anchor").addEventListener("click",viewStatus);

async function viewStatus()
{
    let response = await fetch("http://localhost:5000/reimbursement",{
        method: "GET",
        credentials: "include"
    });

    console.log(response);

    if(response.status === 200){
        let data = await response.json();
        console.log(data);
        
        for(let reimbursement of data)
        {
            let row = document.createElement("tr");
            let cell = document.createElement("td");

            cell.innerHTML = reimbursement.id;
            row.appendChild(cell);

            let cell2 = document.createElement("td");
            cell2.innerHTML = reimbursement.author;
            row.appendChild(cell2)

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursement.resolver;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursement.description;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursement.type;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.status;
            row.appendChild(cell6);

            let cell7 = document.createElement("td");
            cell7.innerHTML = reimbursement.amount;
            row.appendChild(cell7);

            document.getElementById("data_table").appendChild(row);
        }
    }
}