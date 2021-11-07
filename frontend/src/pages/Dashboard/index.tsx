import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DunotChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
  return (
    <div>
      <>
        <NavBar />
        <div className="container">
          <h1 className="text-primary py-3">Dashboard</h1>

          <div className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center text-secundary">
                Taxa de conversão em vendas (%)
              </h5>
              <BarChart />
            </div>
            <div className="col-sm-6">
              <h5 className="text-center text-secundary">Todas as Vendas</h5>
              <DunotChart />
            </div>
          </div>

          <div className="py-3">
            <h2 className="text-primary">Todas as vendas</h2>
          </div>

          <DataTable />
        </div>
        <Footer />
      </>
    </div>
  );
};

export default Dashboard;
