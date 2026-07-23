import './App.css';

function App() {

  const office = {
    name: "Tech Park Office",
    rent: 55000,
    address: "Salt Lake, Kolkata"
  };

  const officeList = [
    {
      id: 1,
      name: "Tech Park",
      rent: 55000,
      address: "Salt Lake"
    },
    {
      id: 2,
      name: "Infinity Tower",
      rent: 75000,
      address: "Sector V"
    },
    {
      id: 3,
      name: "Smart Works",
      rent: 65000,
      address: "New Town"
    }
  ];

  return (
    <div className="App">

      <h1>Office Space Rental App</h1>

      <img
        src="/office.jpg"
        alt="Office"
        width="500"
        height="300"
      />

      <hr />

      <h2>Single Office Details</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> ₹{office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Office List</h2>

      {
        officeList.map((item) => (

          <div
            key={item.id}
            style={{
              border: "1px solid gray",
              margin: "15px",
              padding: "15px"
            }}
          >

            <h3>{item.name}</h3>

            <p
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              <b>Rent:</b> ₹{item.rent}
            </p>

            <p>
              <b>Address:</b> {item.address}
            </p>

          </div>

        ))
      }

    </div>
  );
}

export default App;