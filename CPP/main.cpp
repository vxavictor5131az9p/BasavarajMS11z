#include <iostream>
#include<vector>
#include <iterator>
#include<list>
#define MAX 50

using namespace std;

enum BusType {
    BT_BUS201,    BT_BUS200,    BT_BUS100
};

class UserNamePasswordException{
public:
    int errNo;
    string msg;

    UserNamePasswordException(int n,string mg)
    {
        errNo=n;
        msg=mg;
    }
    void displayAdminError()
    {
        cout<<errNo<<":"<<msg<<endl;
    }
};

class InvalidStationIDException{
public:
    int errNo;
    string msg;

    InvalidStationIDException(int n,string mg)
    {
        errNo=n;
        msg=mg;
    }
    void displayStationIdError()
    {
        cout<<errNo<<":"<<msg<<endl;
    }
};

class CompanyEmployee
{
public:
    string empId;
    string empName;
    float  salary;
    int empAge;
    string empType;
    string empAddress;
    //int countEmp=0;

    CompanyEmployee()
    {
        empId="";
        empName="";
        salary=0;
        empAge=0;
        empType="";
        empAddress="";
    }
    CompanyEmployee(string eid,string ename,float s,int a,string et,string ea)
    {
        empId=eid;
        empName=ename;
        salary=s;
        empAge=a;
        empType=et;
        empAddress=ea;
       // countEmp+=1;

    }
    void displayCompEmp()
    {
        cout<<"\nCompany Employee................"<<endl;
        cout<<"Employee ID:"<<empId<<"Employee Name:"<<empName<<"Salary:"<<salary<<"Age:"<<empAge<<"Employee Type:"<<empType<<"Address:"<<empAddress<<endl;

    }


};

class EntranceMode
{
public:
    string eModeType;
    string source;
    string destination;
    float travelDistance;

    EntranceMode()
    {
        eModeType="";
        source="";
        destination="";
        travelDistance=0;

    }
    EntranceMode(string emt,string src,string dst,float td)
    {
        eModeType=emt;
        source=src;
        destination=dst;
        travelDistance=td;

    }
    virtual void displayMode()
    {
        cout<<"\nEntrance Mode................"<<endl;
        cout<<"Mode Type:"<<eModeType<<"\tSource:"<<source<<"\tDestination:"<<destination<<"\tTravel Distance:"<<travelDistance<<" km"<<endl;
    }

};

class Ticket:public EntranceMode
{
public:
    int serialNo;
    string date;
    string time;
    string ticketType;
    float ticketPrice;
    string operatorId;

    Ticket():EntranceMode()
    {
        serialNo=0;
        date="";
        time="";
        ticketType="";
        ticketPrice=0;
        operatorId="";
    }
    Ticket(string em,string src,string dst,float td,int sn,string dt,string t,string tt,float tp,string oid):EntranceMode(em,src,dst,td)
    {
        serialNo=sn;
        date=dt;
        time=t;
        ticketType=tt;
        ticketPrice=tp;
        operatorId=oid;
    }

    void displayMode()
    {
        cout<<"\nTicket Entrance Mode............"<<endl;
        EntranceMode::displayMode();
        cout<<"Serial Number:"<<serialNo<<"\tDate:"<<date<<"\nTime:"<<time<<"\tTicket Type:"<<ticketType<<"\tTicket Price:"<<ticketPrice<<"\tOperator ID:"<<operatorId<<endl;

    }
};

class SmartCard:public EntranceMode
{
public:
    string smartCardType;
    string holderName;
    string validity;
    float balance;

    SmartCard():EntranceMode()
    {
        smartCardType="";
        holderName="";
        validity="";
        balance=0;
    }
    SmartCard(string em,string src,string dst,float td,string sct,string hn,string val,float bal):EntranceMode(em,src,dst,td)
    {
        smartCardType=sct;
        holderName=hn;
        validity=val;
        balance=bal;
    }
    void displayMode()
    {
        cout<<"\nSmart Card Entrance Mode........"<<endl;
        EntranceMode::displayMode();
        cout<<"Smart Card Type:"<<smartCardType<<"\tHolder Name:"<<holderName<<"\tValidity:"<<validity<<"\tBalance:"<<balance<<endl;
    }
    void rechargeSmartCard(float x)
    {   cout<<"\n\nBefore Recharge"<<endl;
        displayMode();
        balance+=x;
        cout<<"\nRecharged"<<endl;
        displayMode();
    }
};


class Passenger
{
public:
    string pasName;
    int pasAge;
    string pasType;
    EntranceMode *eMode; //Passenger owns Entrance Mode

    Passenger()
    {
       pasName="";
       pasAge=0;
       pasType="";

    }
    Passenger(string pn,int pa,string pt,EntranceMode *em)
    {
       pasName=pn;
       pasAge=pa;
       pasType=pt;
       eMode=em;
    }
    void displayPassenger()
    {
        cout<<"\nDisplay Passenger......"<<endl;
        cout<<"Passenger Name:"<<pasName<<"\tPassenger Age:"<<pasAge<<"\tPassenger Type:"<<pasType<<endl;
        eMode->displayMode();
    }
};

class PasInfSys
{
public:
    string arrivalFrom;
    string destinationTo;
    int arrivingIn;
    string  busName;

    PasInfSys()
    {

        arrivalFrom="";
        destinationTo="";
        arrivingIn=0;
        busName="";
    }
    PasInfSys(string af,string dt,int ain,string bn)
    {

        arrivalFrom=af;
        destinationTo=dt;
        arrivingIn=ain;
        busName=bn;
    }

    void displayPasInfSys()
    {
        cout<<"\nDisplay Passenger Information System.........."<<endl;
        cout<<"Arriving From:"<<arrivalFrom<<"\tDestination To:"<<destinationTo<<"\tArriving In:"<<arrivingIn<<" min"<<"\tBus Name:"<<busName<<endl;
    }
};

class Station
{
public:
    string stationCode;
    string stationName;
    string counterOperators[2];
    Passenger *passengers;     //Station has passengers
    PasInfSys *pasInfSys;      //Station has passenger information system

    Station()
    {
        stationCode="";
        stationName="";

    }

    Station(string sc,string sn,string *co)
    {
        stationCode=sc;
        stationName=sn;
        for(int i=0;i<2;i++)
        {
            counterOperators[i]=co[i];
        }
    }
    void display()
    {
        cout<<"\nDisplay Station.............."<<endl;
        cout<<"Station Code:"<<stationCode<<"\tStation Name:"<<stationName<<endl;
        for(int i=0;i<2;i++)
        {
            cout<<"Counter Operator:"<<i<<": "<<counterOperators[i]<<endl;
        }
        //passengers->displayPassenger();

    }
    void displaySt()
    {
        cout<<"\nDisplay Station.............."<<endl;
        cout<<"Station Code:"<<stationCode<<"\tStation Name:"<<stationName<<endl;
        for(int i=0;i<2;i++)
        {
            cout<<"Counter Operator:"<<i<<": "<<counterOperators[i]<<endl;
        }
        for(int i=0;i<sizeof(passengers)/2;i++)
        {
             passengers[i].displayPassenger();

        }

    }
};

class Bus
{
public:
    int busNo;
    string busType;
    int noOfSeats;
    int busCapacity;
    int busLength;
    string fromStation;
    string toStation;
    static Bus* Create(BusType type);

    Bus()
    {
        busNo=0;
        busType="";
        noOfSeats=0;
        busCapacity=0;
        busLength=0;
        fromStation="";
        toStation="";

    }
    Bus(int bn,string bt,int ns,int bc,int bl,string fs,string ts)
    {
        busNo=bn;
        busType=bt;
        noOfSeats=ns;
        busCapacity=bc;
        busLength=bl;
        fromStation=fs;
        toStation=ts;
    }
    virtual void displayBus()
    {
        cout<<"\nDisplay Bus..................."<<endl;
        cout<<"Bus No:"<<busNo<<"\tBus Type:"<<busType<<"\tNumber Of Seats:"<<noOfSeats<<"\tBus Capacity:"<<busCapacity<<"\tBus Length:"<<busLength<<"\tFrom Station:"<<fromStation<<"\tTo Station:"<<toStation<<endl;

    }

};
class Bus201:public Bus
{
public:
    vector <string> availableStops1;
    string bus201Type;

    Bus201():Bus()
    {
       // availableStops;
        bus201Type="";
    }
    Bus201(int bn,string bt,int ns,int bc,int bl,string fs,string ts,string btype):Bus(bn,bt,ns,bc,bl,fs,ts)
    {
        bus201Type=btype;

        availableStops1.push_back("Dharwad-New-Bus-Stop");
        availableStops1.push_back("Dharwad-Terminal");
        availableStops1.push_back("Jubili circle");
        availableStops1.push_back("Court-Circle");
        availableStops1.push_back("NTTF");
        availableStops1.push_back("TollNaka");
        availableStops1.push_back("JSS");
        availableStops1.push_back("Vidyagiri");
        availableStops1.push_back("Gandhinagar");
        availableStops1.push_back("Lakamanahalli");
        availableStops1.push_back("Sattur");
        availableStops1.push_back("SDM");
        availableStops1.push_back("Navalur Station");
        availableStops1.push_back("Rayapur");
        availableStops1.push_back("Iskcon");
        availableStops1.push_back("RTO");
        availableStops1.push_back("NavaNagar");
        availableStops1.push_back("APMC");
        availableStops1.push_back("Shantiniketan");
        availableStops1.push_back("Bhairidevarakoppa");
        availableStops1.push_back("Unkal Lake");
        availableStops1.push_back("Unkal Village");
        availableStops1.push_back("Unkal Cross");
        availableStops1.push_back("BVB");
        availableStops1.push_back("Vidya Nagar");
        availableStops1.push_back("KIMS");
        availableStops1.push_back("Hosur Cross");
        availableStops1.push_back("OCBC");
        if(btype=="B-D"||btype=="B-U")
        {
          availableStops1.push_back("Railway Station");
        }

    }

    void displayBus()
    {
        cout<<"\nDisplay 201 Bus................"<<endl;
        cout<<"Available Stops:"<<endl;
        for(int i=0;i<availableStops1.size();i++)
        {
            cout<<availableStops1[i]<<":";
        }

        cout<<"\nBus 201 Type:"<<bus201Type<<endl;
        Bus::displayBus();
    }


};


class Bus200:public Bus
{
public:
    vector <string> availableStops;
    string bus200Type;

    Bus200():Bus()
    {
       // availableStops={};
        bus200Type="";
    }
    Bus200(int bn,string bt,int ns,int bc,int bl,string fs,string ts,string btype):Bus(bn,bt,ns,bc,bl,fs,ts)
    {
        bus200Type=btype;

        availableStops.push_back("Dharwad-Terminal");
        availableStops.push_back("Jubili circle");
        availableStops.push_back("Court-Circle");
        availableStops.push_back("NTTF");
        availableStops.push_back("TollNaka");
        availableStops.push_back("JSS");
        availableStops.push_back("Vidyagiri");
        availableStops.push_back("Gandhinagar");
        availableStops.push_back("Lakamanahalli");
        availableStops.push_back("Sattur");
        availableStops.push_back("SDM");
        availableStops.push_back("Navalur Station");
        availableStops.push_back("Rayapur");
        availableStops.push_back("Iskcon");
        availableStops.push_back("RTO");
        availableStops.push_back("NavaNagar");
        availableStops.push_back("APMC");
        availableStops.push_back("Shantiniketan");
        availableStops.push_back("Bhairidevarakoppa");
        availableStops.push_back("Unkal Lake");
        availableStops.push_back("Unkal Village");
        availableStops.push_back("Unkal Cross");
        availableStops.push_back("BVB");
        availableStops.push_back("Vidya Nagar");
        availableStops.push_back("KIMS");
        availableStops.push_back("Hosur Cross");
        availableStops.push_back("Dr.B.R.Ambedkar Circle");

        if(btype=="A-D"||btype=="A-U")
        {
            availableStops.push_back("OCBC");
            availableStops.push_back("Hubli CBT");
            availableStops.push_back("Railway Station");
        }

    }

    void displayBus()
    {
        cout<<"\nDisplay 200 Bus................"<<endl;
        cout<<"Available Stops:"<<endl;
        for(unsigned i=0;i<availableStops.size();i++)
        {
            cout<<availableStops[i]<<":";
        }
        cout<<"\nBus 200 Type:"<<bus200Type<<endl;
        Bus::displayBus();
    }


};

class Bus100:public Bus
{
public:
    vector <string> availableStops;
    string bus100Type;

    Bus100():Bus()
    {
       // availableStops={};
        bus100Type="";
    }
    Bus100(int bn,string bt,int ns,int bc,int bl,string fs,string ts,string btype):Bus(bn,bt,ns,bc,bl,fs,ts)
    {
        availableStops.push_back("Dharwad-Terminal");
        availableStops.push_back("Jubilee Circle");
        availableStops.push_back("Court Circle");
        availableStops.push_back("NTTF");
        availableStops.push_back("TollNaka");
        availableStops.push_back("SDM");
        availableStops.push_back("KIMS");
        availableStops.push_back("Hosur Cross");
        availableStops.push_back("OCBS");

        bus100Type=btype;
    }

    void displayBus()
    {
        cout<<"\nDisplay 100 Bus................"<<endl;
        cout<<"Available Stops:"<<endl;
        for(unsigned i=0;i<availableStops.size();i++)
        {
            cout<<availableStops[i]<<":";
        }
        cout<<"\nBus 100 Type:"<<bus100Type<<endl;
        Bus::displayBus();
    }
  /*  void addBus(Bus100 *b100,int n)
    {
        //int bn1,nos1,bl1,bc1;string bt1,src1,dst1,b100t1;
        cout<<"Enter Bus details:"<<endl;
        cout<<"BusNo:";cin>>b100[n].busNo;
        cout<<"BusType:";cin>>b100[n].busType;
        cout<<"NoOfSeats:";cin>>b100[n].noOfSeats;
        cout<<"BusCapacity:";cin>>b100[n].busCapacity;
        cout<<"BusLength:";cin>>b100[n].busLength;
        cout<<"Source:";cin>>b100[n].fromStation;
        cout<<"Destination:";cin>>b100[n].toStation;
        cout<<"Bus100Type:";cin>>b100[n].bus100Type;




       // b100.bus100Type=b100t1;
    }
*/

};

Bus* Bus::Create(BusType type) {
    if (type == BT_BUS201)
        return new Bus201(3,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D");
    else if (type == BT_BUS200)
        return new Bus200(101,"200",35,65,14,"Dharwad BRTS Terminal","Dr.B.R.Ambedkar Circle","C-D");
    else if (type == BT_BUS100)
        return new Bus100(101,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D");
    else return NULL;
}
class BusFactory {

private:
    Bus *pBus;
public:

    // Client doesn't explicitly create objects
    // but passes type to factory method "Create()"
    BusFactory()
    {
        BusType type = BT_BUS100;
        pBus = Bus::Create(type);
    }
    ~BusFactory() {
        if (pBus) {
            delete[] pBus;
            pBus = NULL;
        }
    }
    Bus* getBus()  {
        return pBus;
    }

};
class GreenBRTS
{
public:
    string plantnPhase;
    string year;
    int noOfPlants;
    string plantedPlace;
    //static int countevent;

    GreenBRTS()
    {
        plantnPhase="";
        year="";
        noOfPlants=0;
        plantedPlace="";
       // countevent+=1;

    }

    GreenBRTS(string pp,string y,int n,string p)
    {
        plantnPhase=pp;
        year=y;
        noOfPlants=n;
        plantedPlace=p;
       // countevent+=1;

    }

    void displayGreenBRTS()
    {
        cout<<"\nGreen BRTS....................."<<endl;
        cout<<"Plantation Phase:"<<plantnPhase<<"\tYear:"<<year<<"\tNumber of Plants:"<<noOfPlants<<"\tPlanted Location:"<<plantedPlace<<endl;
    }

};
//int GreenBRTS::countevent=0;


class Branch
{
public:
    string branchId;
    string branchName;
    string branchLocation;
    string branchState;
    string branchOpYear;
    string *adminUN;
    string *adminPW;
    GreenBRTS *plantsPlanted;      //Branch has event GreenBRTS
    CompanyEmployee *compEmployees;//Branch has company employees
    Station *stations;              //Branch own stations
    Bus *buses[3];                     //Branch own buses
    Bus100 *b100;
    Bus200 *b200;
    Bus201 *b201;

    Branch()
    {
        branchId="";
        branchName="";
        branchLocation="";
        branchState="";
        branchOpYear="";


    }
    Branch(string bid,string bname,string bloc,string bs,string boy,string *un,string *pw,Station *s,Bus100 *b1,Bus200 *b2,Bus201 *b3)
    {
        branchId=bid;
        branchName=bname;
        branchLocation=bloc;
        branchState=bs;
        branchOpYear=boy;
        adminUN=un;
        adminPW=pw;
        stations=s;
        //buses=b;
        b100=b1;
        b200=b2;
        b201=b3;
    }
    int verifyAdmin(string *un,string *pwd,int x)
    {
        for(int i=0;i<x;i++)
        {
            if(adminUN[i]==*un&&adminPW[i]==*pwd){
                return 1;
            }
            else{
                 throw UserNamePasswordException(10101,"Incorrect Username or Password");
            }
        }
    }
    void displayBranch(int a,int b,int c,int d,int e,int f)
    {
        cout<<"\nDisplay Branch..........."<<endl;
        cout<<"Branch ID:"<<branchId<<"\tBranch Name:"<<branchName<<"\tBranch Location:"<<branchLocation<<"\tBranch State:"<<branchState<<"\tOpening year:"<<branchOpYear<<endl;
        showGreenBRTS(a);
        showCompEmp(b);
        showStation(c);
        showBus(d,e,f);
    }
    void showGreenBRTS(int a)
    {
        for(unsigned i=0;i<a;i++)
        {
            plantsPlanted[i].displayGreenBRTS();
        }
    }

    void showCompEmp(int b)
    {
        for(unsigned j=0;j<b;j++)
        {
            compEmployees[j].displayCompEmp();
        }
    }

    void showStation(int c)
    {
        for(unsigned k=0;k<c;k++)
        {
            stations[k].display();
        }
    }
    void showBus(int d,int e,int f)
    {
        buses[0]=b100;
        buses[1]=b200;
        buses[2]=b201;

        for(int i=0;i<d;i++)
        {
           buses[0]=&b100[i];
           buses[0]->displayBus();
        }
        for(int i=0;i<e;i++)
        {
           buses[1]=&b200[i];
           buses[1]->displayBus();
        }
        for(int i=0;i<f;i++)
        {
           buses[2]=&b201[i];
           buses[2]->displayBus();
        }
    }

};

class Company
{
public:
    string compId;
    string compName;
    string openingYear;
    Branch *branches;

    Company()
    {
        compId="";
        compName="";
        openingYear="";
    }
    Company(string cId,string cName,string oY)
    {
        compId=cId;
        compName=cName;
        openingYear=oY;
    }
    void displayCompany()
    {
        cout<<"\nCompany Details.................."<<endl;
        cout<<"Company ID:"<<compId<<"\tCompany Name:"<<compName<<"\tOpening Year:"<<openingYear<<endl;
    }

};


int main()
{
    /*
    CompanyEmployee ce[MAX];
    int i=0;
    for(int i=0;i<MAX;i++)
    {
        ce[i].assign();
    }
    ce[3].display(ce,MAX);
    */
    Company brts("COMP01","BRTS","2006");
    brts.displayCompany();

    int s=32;
    string co1[]={"Anil","Naveen"},co2[]={"Vikas","Anita"},co3[]={"Sukanya","Shriram"},co4[]={"Sudha","Spoorthi"},co5[]={"Sunil","Nitesh"},
           co6[]={"Aditya","Bharat"},co7[]={"Keertan","Shashi"},co8[]={"Sumant","Siddesh"},co9[]={"Swati","Shrinivas"},co10[]={"Shankar","Rajesh"},
           co11[]={"Param","Rohan"},co12[]={"Ninad","Sanjay"},co13[]={"Sunil","Chandan"},co14[]={"Raj","Jaya"},co15[]={"Preetam","Vipul"},
           co16[]={"Suraksha","Vidya"},co17[]={"Sandesh","Abhi"},co18[]={"Ananya","Amit"},co19[]={"Naveen","Abhishek"},co20[]={"Sukumar","Nitya"},
           co21[]={"Keerti","Vinay"},co22[]={"Suhas","Nagaraj"},co23[]={"Savita","Mahesh"},co24[]={"Jaya","Krishna"},co25[]={"Praveen","Kiran"},
           co26[]={"Hitesh","Vandana"},co27[]={"Prakalp","Pooja"},co28[]={"Raksha","Raju"},co29[]={"Bhuvan","Harish"},co30[]={"Pavan","Sumant"},
           co31[]={"Pradeep","Kushal"},co32[]={"Ramesh","Siresh"};


    Station s1("ST01","Dharwad New Bus Stop",co1),s2("ST02","Dharwad BRTS bus Terminal",co2),
            s3("ST03","Jubilee Circle",co3),s4("ST04","Court circle",co4),
            s5("ST05","NTTF",co5),s6("ST06","Hosa Yellapur Cross",co6),
            s7("ST07","Toll Naka",co7),s8("ST08","JSS",co8),
            s9("ST09","Vidyagiri",co9),s10("ST10","Gandhi Nagar",co10),
            s11("ST11","Lakamanahalli",co11),s12("ST12","Sattur",co12),
            s13("ST13","SDM",co13),s14("ST14","Navalur Station",co14),
            s15("ST15","Rayapur",co15),s16("ST16","Iskcon",co16),
            s17("ST17","RTO",co17),s18("ST18","Navanagar",co18),
            s19("ST19","APMC",co19),s20("ST20","Shantiniketan",co20),
            s21("ST21","Bhairidevarkoppa",co21),s22("ST22","Unkal Lake",co22),
            s23("ST23","Unkal village",co23),s24("ST24","Unkal cross",co24),
            s25("ST25","BVB",co25),s26("ST26","Vidya Nagar",co26),
            s27("ST27","KIMS",co27),s28("ST28","Hosur Cross",co28),
            s29("ST29","Dr.B.R.Ambedkar Circle",co29),s30("ST30","OCBS",co30),
            s31("ST31","Hubli CBT",co31),s32("ST32","Railway Station-Hubli",co32);

    //Station st[]={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32};
   // Branch.stations=st;
       Ticket t1("Ticket","Dharwad New Bus Stop","Dharwad BRTS Terminal",1.0,001,"10-01-2020","10:10:03","StudentPass",1.00,"A23B"),
           t2("Ticket","Dharwad BRTS Terminal","JSS",4.2,010,"12-12-2019","12:50:30","StudentPass",1.00,"M25B"),
           t3("Ticket","Jubilee Circle","BVB",13.2,006,"02-04-2019","12:50:30","StudentPass",1.00,"C25G"),
           t4("Ticket","Court circle","KIMS",13.8,007,"21-02-2019","12:50:30","Passenger",20.00,"V25L"),
           t5("Ticket","NTTF","JSS",1.8,003,"27-01-2019","12:50:30","MonthlyPass",2.00,"K48K"),
           t6("Ticket","Hosa Yellapur Cross","BVB",11.4,015,"12-02-2019","12:50:30","StudentPass",1.00,"H55D"),
           t7("Ticket","Toll Naka","Jubilee Circle",2.4,026,"12-03-2019","12:10:30","StudentPass",1.00,"V24E"),
           t8("Ticket","JSS","Jubilee Circle",3,045,"18-04-2019","10:10","Passenger",15.00,"E26R"),
           t9("Ticket","Vidyagiri","JSS",0.6,041,"12-06-2019","11:40:26","StudentPass",1.00,"W35R"),
           t10("Ticket","Gandhi Nagar","Toll Naka",1.8,063,"12-12-2019","12:50:30","MonthlyPass",2.00,"J55E"),
           t11("Ticket","Lakamanahalli","JSS",1.8,045,"13-10-2019","12:50:30","StudentPass",1.00,"V36V"),
           t12("Ticket","Sattur","SDM",0.6,101,"12-05-2019","12:50:30","Passenger",8.00,"W65F"),
           t13("Ticket","SDM","Sattur",0.6,221,"12-09-2019","12:00:23","StudentPass",1.00,"2ERG"),
           t14("Ticket","Navalur Station","OCBS",9.6,201,"12-08-2019","10:10:10","StudentPass",1.00,"AV09"),
           t15("Ticket","Rayapur","BVB",6.0,301,"12-10-2019","10:10","MonthlyPass",2.00,"K6YV"),
           t16("Ticket","Iskcon","Vidya Nagar",6.0,401,"12-10-2019","10:10","Passenger",16.00,"8YHN"),
           t17("Ticket","RTO","Navanagar",0.6,321,"10-12-2019","10:10","StudentPass",1.00,"KJ93"),
           t18("Ticket","Navanagar","Toll Naka",7,361,"09-12-2019","10:10","StudentPass",1.00,"NK8M"),
           t19("Ticket","APMC","JSS",7,001,"23-02-2019","10:10","StudentPass",1.00,"MN98"),
           t20("Ticket","Shantiniketan","Hosur Cross",8,065,"18-11-2019","10:10","MonthlyPass",2.00,"JH98"),
           t21("Ticket","Bhairidevarkoppa","KIMS",4,045,"13-12-2019","12:50:30","StudentPass",1.00,"KJN9"),
           t22("Ticket","Unkal Lake","Navanagar",3,011,"16-02-2020","20:20:30","StudentPass",1.00,"JN89"),
           t23("Ticket","Unkal Village","BVB",1.2,041,"12-10-2019","06:40:30","StudentPass",1.00,"LKJ0"),
           t24("Ticket","Unkal Cross","Vidyagiri",1.2,241,"19-01-2019","12:50:30","Passenger",10.00,"KJY9"),
           t25("Ticket","BVB","KIMS",1.2,751,"12-11-2019","12:50:30","MonthlyPass",2.00,"KJH8"),
           t26("Ticket","Vidya Nagar","Unkal Lake",1.8,301,"14-04-2019","12:50:30","StudentPass",1.00,"7Y8Y"),
           t27("Ticket","KIMS","OCBS",4.0,245,"02-08-2019","14:50:30","StudentPass",1.00,"IUY8"),
           t28("Ticket","Hosur Cross","OCBS",0.6,125,"17-07-2019","12:50:20","Passenger",10.00,"KJH9"),
           t29("Ticket","Dr.B.R.Ambedkar Circle","BVB",15,489,"02-05-2019","18:00:30","StudentPass",1.00,"987H"),
           t30("Ticket","Hubli CBT","Jubilee Circle",17,155,"26-12-2019","09:10:20","MonthlyPass",2.00,"98HN"),
           t31("Ticket","OCBS","BVB",4.6,136,"27-02-2020","16:50:10","StudentPass",1.00,"987H"),
           t32("Ticket","Railway Station-Hubli","OCBS",4.2,851,"11-05-2019","12:50:38","Passenger",10.00,"YH9B");

    SmartCard sc1("SmartCard","Dharwad New Bus Stop","OCBS",18.0,"Concessional","Abhay","Valid",230),
              sc2("SmartCard","Dharwad BRTS Terminal","JSS",4.2,"Student","Vinay","Valid",412),
              sc3("SmartCard","Jubilee Circle","BVB",13.2,"Concessional","Kumar","Valid",654),
              sc4("SmartCard","Court circle","KIMS",13.8,"Student","Vijay","Valid",256),
              sc5("SmartCard","NTTF","JSS",1.8,"Student","Sidram","Valid",659),
              sc6("SmartCard","Hosa Yellapur Cross","BVB",11.4,"Student","Amrita","Valid",264),
              sc7("SmartCard","Toll Naka","Jubilee Circle",2.4,"Concessional","Keshav","Valid",326),
              sc8("SmartCard","JSS","Jubilee Circle",3,"Student","Karthik","Valid",256),
              sc9("SmartCard","Vidyagiri","JSS",0.6,"Student","Sunil","Valid",500),
              sc10("SmartCard","Gandhi Nagar","Toll Naka",1.8,"Concessional","Praveen","Valid",366),
              sc11("SmartCard","Lakamanahalli","JSS",1.8,"Student","Chinmay","Valid",2369),
              sc12("SmartCard","Sattur","SDM",0.6,"Student","Kirti","Valid",369),
              sc13("SmartCard","SDM","Sattur",0.6,"Student","Karun","Valid",985),
              sc14("SmartCard","Navalur Station","OCBS",9.6,"Concessional","Sonal","Valid",369),
              sc15("SmartCard","Rayapur","BVB",6.0,"Student","Chirag","Valid",856),
              sc16("SmartCard","Iskcon","Vidya Nagar",6.0,"Student","Vilas","Valid",321),
              sc17("SmartCard","RTO","Navanagar",0.6,"Student","Jagadeesh","Valid",695),
              sc18("SmartCard","Navanagar","Toll Naka",7,"Concessional","Pradeep","Valid",963),
              sc19("SmartCard","APMC","JSS",7,"Student","Sukanya","Valid",964),
              sc20("SmartCard","Shantiniketan","Hosur Cross",8,"Student","Sadhvi","Valid",258),
              sc21("SmartCard","Bhairidevarkoppa","KIMS",4,"Concessional","Mohan","Valid",685),
              sc22("SmartCard","Unkal Lake","Navanagar",3,"Student","Milan","Valid",326),
              sc23("SmartCard","Unkal Village","BVB",1.2,"Student","Aravind","Valid",687),
              sc24("SmartCard","Unkal Cross","Vidyagiri",1.2,"Student","Rajini","Valid",326),
              sc25("SmartCard","BVB","KIMS",1.2,"Student","Kalmesh","Valid",248),
              sc26("SmartCard","Vidya Nagar","Unkal Lake",1.8,"Concessional","Samarth","Valid",264),
              sc27("SmartCard","KIMS","OCBS",4.0,"Student","Shanmukh","Valid",265),
              sc28("SmartCard","Hosur Cross","OCBS",0.6,"Student","Vishnu","Valid",326),
              sc29("SmartCard","Dr.B.R.Ambedkar Circle","BVB",15,"E-Purse","Madan","Valid",8527),
              sc30("SmartCard","Hubli CBT","Jubilee Circle",17,"E-Purse","Roshan","Valid",2598),
              sc31("SmartCard","OCBS","BVB",4.6,"E-Purse","Manish","Valid",5000),
              sc32("SmartCard","Railway Station-Hubli","3.4",4.2,"E-Purse","Manohar","Valid",6254);


    SmartCard scn[]={sc1,sc2,sc3,sc4,sc5,sc6,sc7,sc8,sc9,sc10,sc11,sc12,sc13,sc14,sc15,sc16,sc17,sc18,sc19,sc20,sc21,sc22,sc23,sc24,sc25,sc26,sc27,sc28,sc29,sc30,sc31,sc32};

    EntranceMode *em1,*em2,*em3,*em4,*em5,*em6,*em7,*em8,*em9,*em10,*em11,*em12,*em13,*em14,*em15,*em16,
                 *em17,*em18,*em19,*em20,*em21,*em22,*em23,*em24,*em25,*em26,*em27,*em28,*em29,*em30,*em31,*em32,
                 *em33,*em34,*em35,*em36,*em37,*em38,*em39,*em40,*em41,*em42,*em43,*em44,*em45,*em46,*em47,*em48,
                 *em49,*em50,*em51,*em52,*em53,*em54,*em55,*em56,*em57,*em58,*em59,*em60,*em61,*em62,*em63,*em64;
   // EntranceMode* em2;
    em1=&t1;em2=&sc1;em3=&t2;em4=&sc2;em5=&t3;em6=&sc3;em7=&t4;em8=&sc4;em9=&t5;em10=&sc5;
    em11=&t6;em12=&sc6;em13=&t7;em14=&sc7;em15=&t8;em16=&sc8;em17=&t9;em18=&sc9;em19=&t10;em20=&sc10;
    em21=&t11;em22=&sc11;em23=&t12;em24=&sc12;em25=&t13;em26=&sc13;em27=&t14;em28=&sc14;em29=&t15;em30=&sc15;
    em31=&t16;em32=&sc16;em33=&t17;em34=&sc17;em35=&t18;em36=&sc18;em37=&t19;em38=&sc19;em39=&t20;em40=&sc20;
    em41=&t21;em42=&sc21;em43=&t22;em44=&sc22;em45=&t23;em46=&sc23;em47=&t24;em48=&sc24;em49=&t25;em50=&sc25;
    em51=&t26;em52=&sc26;em53=&t27;em54=&sc27;em55=&t28;em56=&sc28;em57=&t29;em58=&sc29;em59=&t30;em60=&sc30;
    em61=&t31;em62=&sc31;em63=&t32;em64=&sc32;

    Passenger p1("Abhilash",18,"Student",em1),p2("Abhay",26,"Passenger Smart Card",em2);
    Passenger ps1[]={p1,p2};
    s1.passengers=ps1;
    Passenger p3("Suhas",20,"Student",em3),p4("Vinay",26,"Student Smart Card",em4);
    Passenger ps2[]={p3,p4};
    s2.passengers=ps2;
    Passenger p5("Vineeth",18,"Student",em5),p6("Kumar",26,"Concessional Smart Card",em6);
    Passenger ps3[]={p5,p6};
    s3.passengers=ps3;
    Passenger p7("Prakash",38,"Passenger",em7),p8("Vijay",26,"Student Smart Card",em8);
    Passenger ps4[]={p7,p8};
    s4.passengers=ps4;
    Passenger p9("Pramila",28,"MonthlyPass",em9),p10("Sidram",26,"Student Smart Card",em10);
    Passenger ps5[]={p9,p10};
    s5.passengers=ps5;
    Passenger p11("Samir",18,"Student",em11),p12("Amrita",26,"Student Smart Card",em12);
    Passenger ps6[]={p11,p12};
    s6.passengers=ps6;
    Passenger p13("Karan",17,"Student",em13),p14("Keshav",26,"Concessional Smart Card",em14);
    Passenger ps7[]={p13,p14};
    s7.passengers=ps7;
    Passenger p15("Kavita",24,"Passenger",em15),p16("Karthik",26,"Student Smart Card",em16);
    Passenger ps8[]={p15,p16};
    s8.passengers=ps8;
    Passenger p17("Param",20,"Student",em17),p18("Sunil",26,"Student Smart Card",em18);
    Passenger ps9[]={p17,p18};
    s9.passengers=ps9;
    Passenger p19("Shriram",25,"MonthlyPass",em19),p20("Praveen",26,"Concessional Smart Card",em20);
    Passenger ps10[]={p19,p20};
    s10.passengers=ps10;
    Passenger p21("Abhi",19,"Student",em21),p22("Chinmay",26,"Student Smart Card",em22);
    Passenger ps11[]={p21,p22};
    s11.passengers=ps11;
    Passenger p23("Akash",45,"Passenger",em23),p24("Kirti",26,"Student Smart Card",em24);
    Passenger ps12[]={p23,p24};
    s12.passengers=ps12;
    Passenger p25("Koushik",18,"Student",em25),p26("Karun",26,"Student Smart Card",em26);
    Passenger ps13[]={p25,p26};
    s13.passengers=ps13;
    Passenger p27("Sanju",19,"Student",em27),p28("Sonal",26,"Concessional Smart Card",em28);
    Passenger ps14[]={p27,p28};
    s14.passengers=ps14;
    Passenger p29("Mahesh",21,"MonthlyPass",em29),p30("Chirag",26,"Student Smart Card",em30);
    Passenger ps15[]={p29,p30};
    s15.passengers=ps15;
    Passenger p31("Kamal",22,"Passenger",em31),p32("Vilas",26,"Student Smart Card",em32);
    Passenger ps16[]={p31,p32};
    s16.passengers=ps16;
    Passenger p33("Komal",19,"Student",em33),p34("Jagadeesh",26,"Student Smart Card",em34);
    Passenger ps17[]={p33,p34};
    s17.passengers=ps17;
    Passenger p35("Keshraj",18,"Student",em35),p36("Pradeep",26,"Concessional Smart Card",em36);
    Passenger ps18[]={p35,p36};
    s18.passengers=ps18;
    Passenger p37("Raj",21,"Student",em37),p38("Sukanya",26,"Student Smart Card",em38);
    Passenger ps19[]={p37,p38};
    s19.passengers=ps19;
    Passenger p39("Bhuvan",30,"MonthlyPass",em39),p40("Sadhvi",26,"Student Smart Card",em40);
    Passenger ps20[]={p39,p40};
    s20.passengers=ps20;
    Passenger p41("Nitesh",19,"Student",em41),p42("Mohan",26,"Concessional Smart Card",em42);
    Passenger ps21[]={p41,p42};
    s21.passengers=ps21;
    Passenger p43("Shivu",18,"Student",em43),p44("Milan",26,"Student Smart Card",em44);
    Passenger ps22[]={p43,p44};
    s22.passengers=ps22;
    Passenger p45("Siddarth",17,"Student",em45),p46("Aravind",26,"Student Smart Card",em46);
    Passenger ps23[]={p45,p46};
    s23.passengers=ps23;
    Passenger p47("Suman",27,"Passenger",em47),p48("Rajini",26,"Student Smart Card",em48);
    Passenger ps24[]={p47,p48};
    s24.passengers=ps24;
    Passenger p49("Shashank",28,"MonthlyPass",em49),p50("Kalmesh",26,"Student Smart Card",em50);
    Passenger ps25[]={p49,p50};
    s25.passengers=ps25;
    Passenger p51("Satya",17,"Student",em51),p52("Samarth",26,"Concessional Smart Card",em52);
    Passenger ps26[]={p51,p52};
    s26.passengers=ps26;
    Passenger p53("Mithun",19,"Student",em53),p54("Shanmukh",26,"Student Smart Card",em54);
    Passenger ps27[]={p53,p4};
    s27.passengers=ps27;
    Passenger p55("Purvik",42,"Passenger",em55),p56("Vishnu",26,"Student Smart Card",em56);
    Passenger ps28[]={p55,p56};
    s28.passengers=ps28;
    Passenger p57("Prajwal",20,"Student",em57),p58("Madan",26,"E-Purse Smart Card",em58);
    Passenger ps29[]={p57,p58};
    s29.passengers=ps29;
    Passenger p59("Adish",29,"MonthlyPass",em59),p60("Roshan",26,"E-Purse Smart Card",em60);
    Passenger ps30[]={p59,p60};
    s30.passengers=ps30;
    Passenger p61("Adarsh",19,"Student",em61),p62("Manish",26,"E-Purse Smart Card",em62);
    Passenger ps31[]={p61,p62};
    s31.passengers=ps31;
    Passenger p63("Prasann",40,"Passenger",em63),p64("Manohar",26,"E-Purse Smart Card",em64);
    Passenger ps32[]={p63,p64};
    s32.passengers=ps32;


/*
    PasInfSys pi1("Depot","OSBC",10,"201D"),pi2("Jubilee-Circle","Railway Station-Hubli",20,"201B");
    PasInfSys pis1[]={pi1,pi2};
    s1.pasInfSys=pis1;
    PasInfSys pi3("Depot","CBT Hubli",8,"200A"),pi4("Depot","Dr.B.R Ambedkar Circle",12,"200C");
    PasInfSys pis2[]={pi3,pi4};
    s2.pasInfSys=pis2;
*/


    PasInfSys pi1("Depot","OSBC",10,"201D"),pi2("jubilee-circle","Railway station-hubli",20,"201B"),
              pi3("Depot","CBT-HUBLI",8,"200A"),pi4("Depot","Dr.B.R Ambedkar circle",12,"200C"),
              pi5("Dharwad BRTS Terminal","OSBC",7,"100D"),pi6("Dharwad-new-bustand","CBT-Hubli",15,"200A"),
              pi7("Jubilee circle","CBT-HUBLI",17,"201B"),pi8("Court cicle","Dharwad BRTS Terminal",14,"200A"),
              pi9("Court circle","Railway station-hubli",18,"201B"),pi10("jubilee-circle","Dr.B.R Ambedkar cicle",10,"200C"),
              pi11("Dharwad-new-bustand","OSBC",10,"100D"),pi12("Dharwad-BRTS-Terminal","Navanagar",8,"200A"),
              pi13("Dharwad-BRTS-Terminal","OSBC",9,"100D"),pi14("Dharwad-BRTS-Terminal","SDM-Medical",7,"200A"),
              pi15("Railway station-hubli","SDM-Medical",14,"201D"),pi16("Hosur","Dharwad-BRTS-Terminal",20,"200C"),
              pi17("CBT-HUBLI","Court circle",17,"201B"),pi18("Dr.B.R Ambedkar circle","Dharwad-BRTS-Terminal",10,"100D"),
              pi19("Vidyanagar","SDM-Medical",9,"201D"),pi20("Unkal","Dharwad-BRTS-Terminal",17,"200A"),
              pi21("Depot","Unkal-village",12,"200C"),pi22("Unkal","OSBC",10,"100D"),
              pi23("Depot","OCBS",12,"200C"),pi24("Dharwad BRTS Terminal","OCBS",10,"100D"),
              pi25("Railway station-hubli","Dharwad-BRTS-Terminal",14,"100D"),pi26("BVB","Bhairidevarkoppa",5,"201B"),
              pi27("Navanagar","SDM-Medical",10,"200C"),pi28("KIMS","SDM-Medical",10,"200A"),
              pi29("JSS","BVB",10,"201D"),pi30("JSS","OSBC",12,"100D"),
              pi31("Railway station-hubli","NTTF",15,"200C"),pi32("jubilee-circle","BVB",15,"201D"),
              pi33("Depot","APMC",10,"200C"),pi34("Dharwad-new-bustand","Toll Naka",8,"200A"),
              pi35("Railway station-hubli","Navanagar",7,"201D"),pi36("Railway station-hubli","Bhairidevarkoppa",9,"201B"),
              pi37("Dharwad-BRTS-Terminal","Railway station-hubli",20,"200C"),pi38("jubilee-circle","KIMS",14,"200A"),
              pi39("Railway station-hubli","Vidyanagar",6,"201B"),pi40("Toll Naka","Dharwad-BRTS-Terminal",7,"100D"),
              pi41("SDM-Medical","Dr.B.R Ambedkar circle",9,"201D"),pi42("Depot","Railway station-hubli",20,"201B"),
              pi43("Dharwad-BRTS-Terminal","Shantiniketan",8,"200A"),pi44("NTTF","OSBC",10,"100D"),
              pi45("Railway station-hubli","NTTF",15,"200C"),pi46("jubilee-circle","BVB",15,"201D"),
              pi47("Dharwad-BRTS-Terminal","Hosur",16,"201B"),pi48("Dharwad-new-bustand","BVB",15,"200A"),
              pi49("Depot","Hosur",17,"200C"),pi50("BVB","CBT-HUBLI",5,"200A"),
              pi51("Navanagar","Dharwad-BRTS-Terminal",10,"100D"),pi52("Dharwad-new-bustand","SDM-Medical",7,"200A"),
              pi53("Navanagar","JSS",7,"200C"),pi54("Vidyanagar","Dharwad-new-bustand",14,"201B"),
              pi55("BVB","jubilee-circle",15,"200A"),pi56("Gandhi Nagar","KIMS",12,"200C"),
              pi57("Navalur Station","Unkal village",8,"201B"),pi58("Rayapur","CBT-HUBLI",12,"200A"),
              pi59("Vidyagiri","BVB",12,"200C"),pi60("Lakamanahalli","Hosur",13,"201B"),
              pi61("Vidyagiri","BVB",12,"200C"),pi62("Lakamanahalli","Hosur",13,"201B"),
              pi63("Navanagar","Dharwad-BRTS-Terminal",10,"100D"),pi64("Dharwad-new-bustand","SDM-Medical",7,"200A");
    PasInfSys pis1[]={pi1,pi2};
    s1.pasInfSys=pis1;
    PasInfSys pis2[]={pi3,pi4};
    s2.pasInfSys=pis2;
    PasInfSys pis3[]={pi5,pi6};
    s3.pasInfSys=pis3;
    PasInfSys pis4[]={pi7,pi8};
    s4.pasInfSys=pis4;
    PasInfSys pis5[]={pi9,pi10};
    s5.pasInfSys=pis5;
    PasInfSys pis6[]={pi11,pi12};
    s6.pasInfSys=pis6;
    PasInfSys pis7[]={pi13,pi14};
    s7.pasInfSys=pis7;
    PasInfSys pis8[]={pi15,pi16};
    s8.pasInfSys=pis8;
    PasInfSys pis9[]={pi17,pi18};
    s9.pasInfSys=pis9;
    PasInfSys pis10[]={pi19,pi20};
    s10.pasInfSys=pis10;
    PasInfSys pis11[]={pi21,pi22};
    s11.pasInfSys=pis11;
    PasInfSys pis12[]={pi23,pi24};
    s12.pasInfSys=pis12;
    PasInfSys pis13[]={pi25,pi26};
    s13.pasInfSys=pis13;
    PasInfSys pis14[]={pi27,pi28};
    s14.pasInfSys=pis14;
    PasInfSys pis15[]={pi29,pi30};
    s15.pasInfSys=pis15;
    PasInfSys pis16[]={pi31,pi32};
    s16.pasInfSys=pis16;
    PasInfSys pis17[]={pi33,pi34};
    s17.pasInfSys=pis17;
    PasInfSys pis18[]={pi35,pi36};
    s18.pasInfSys=pis18;
    PasInfSys pis19[]={pi37,pi38};
    s19.pasInfSys=pis19;
    PasInfSys pis20[]={pi39,pi40};
    s20.pasInfSys=pis20;
    PasInfSys pis21[]={pi41,pi42};
    s21.pasInfSys=pis21;
    PasInfSys pis22[]={pi43,pi44};
    s22.pasInfSys=pis22;
    PasInfSys pis23[]={pi45,pi46};
    s23.pasInfSys=pis23;
    PasInfSys pis24[]={pi47,pi48};
    s24.pasInfSys=pis24;
    PasInfSys pis25[]={pi49,pi50};
    s25.pasInfSys=pis25;
    PasInfSys pis26[]={pi51,pi52};
    s26.pasInfSys=pis26;
    PasInfSys pis27[]={pi53,pi54};
    s27.pasInfSys=pis27;
    PasInfSys pis28[]={pi55,pi56};
    s28.pasInfSys=pis28;
    PasInfSys pis29[]={pi57,pi58};
    s29.pasInfSys=pis29;
    PasInfSys pis30[]={pi59,pi60};
    s30.pasInfSys=pis30;
    PasInfSys pis31[]={pi61,pi62};
    s31.pasInfSys=pis31;
    PasInfSys pis32[]={pi63,pi64};
    s32.pasInfSys=pis32;

    Station st[]={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32};

    Passenger *pn[]={ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9,ps10,ps11,ps12,ps13,ps14,ps15,ps16,ps17,ps18,ps19,ps20,ps21,ps22,ps23,ps24,ps25,ps26,ps27,ps28,ps29,ps30,ps31,ps32};


/*
    //Display passenger in station
    for(int i=0;i<32;i++)
    {
        for(int j=0;j<2;j++){
                if(st[i].stationName=="Dharwad New Bus Stop")
                      st[i].passengers[j].displayPassenger();  //Only passenger

        }

    }
*/

    int bb1=10,bb2=10,bb3=10;
    //Bus *bus;

    Bus100 b1(1,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),b2(2,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
           b3(3,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),b4(4,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
           b5(5,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),b6(6,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
           b7(7,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),b8(8,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
           b9(9,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),b10(10,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U");
    Bus100 bus1[]={b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
    Bus100 *bus100;
    bus100=bus1;

   /*
    Bus100* bus1[]={new Bus100(1,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),new Bus100(2,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
                  new Bus100(3,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),new Bus100(4,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
                  new Bus100(5,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),new Bus100(6,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
                  new Bus100(7,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),new Bus100(8,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U"),
                  new Bus100(9,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D"),new Bus100(10,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U")};
    //Bus100 *bus100;
    //bus100=bus1;
    */
    Bus200 b11(1,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D"),b12(2,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U"),
           b13(3,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D"),b14(4,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U"),
           b15(5,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D"),b16(6,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U"),
           b17(7,"200",35,65,14,"Dharwad BRTS Terminal","Dr.B.R.Ambedkar Circle","C-D"),b18(8,"200",35,65,14,"Dr.B.R.Ambedkar Circle","Dharwad BRTS Terminal","C-U"),
           b19(9,"200",35,65,14,"Dharwad BRTS Terminal","Dr.B.R.Ambedkar Circle","C-D"),b20(10,"200",35,65,14,"Dr.B.R.Ambedkar Circle","Dharwad BRTS Terminal","C-U");
    /*
    Bus200* bus2[]={new Bus200(1,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D"),new Bus200(2,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U"),
                    new Bus200(3,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D"),new Bus200(4,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U"),
                    new Bus200(5,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D"),new Bus200(6,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U"),
                    new Bus200(7,"200",35,65,14,"Dharwad BRTS Terminal","Dr.B.R.Ambedkar Circle","C-D"),new Bus200(8,"200",35,65,14,"Dr.B.R.Ambedkar Circle","Dharwad BRTS Terminal","C-U"),
                    new Bus200(9,"200",35,65,14,"Dharwad BRTS Terminal","Dr.B.R.Ambedkar Circle","C-D"),new Bus200(10,"200",35,65,14,"Dr.B.R.Ambedkar Circle","Dharwad BRTS Terminal","C-U")};
   */
    Bus200 bus2[]={b11,b12,b13,b14,b15,b16,b17,b18,b19,b20};
    Bus200 *bus200;
    bus200=bus2;


    Bus201 b21(1,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D"),b22(2,"201",35,65,14,"Railway Station","Dharwad New Bus Stop","B-U"),
           b23(3,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D"),b24(4,"201",35,65,14,"Railway Station","Dharwad New Bus Stop","B-U"),
           b25(5,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D"),b26(6,"201",35,65,14,"OCBS","Dharwad New Bus Stop","D-U"),
           b27(7,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D"),b28(8,"201",35,65,14,"OCBS","Dharwad New Bus Stop","D-U"),
           b29(9,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D"),b30(10,"201",35,65,14,"OCBS","Dharwad New Bus Stop","D-U");
    /*
    Bus201* bus3[]={ new Bus201(1,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D"),new Bus201(2,"201",35,65,14,"Railway Station","Dharwad New Bus Stop","B-U"),
                     new Bus201(3,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D"),new Bus201(4,"201",35,65,14,"Railway Station","Dharwad New Bus Stop","B-U"),
                     new Bus201(5,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D"),new Bus201(6,"201",35,65,14,"OCBS","Dharwad New Bus Stop","D-U"),
                     new Bus201(7,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D"),new Bus201(8,"201",35,65,14,"OCBS","Dharwad New Bus Stop","D-U"),
                     new Bus201(9,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D"),new Bus201(10,"201",35,65,14,"OCBS","Dharwad New Bus Stop","D-U")};

    */
    Bus201 bus3[]={b21,b22,b23,b24,b25,b26,b27,b28,b29,b30};
    Bus201 *bus201;
    bus201=bus3;
    /*
    Bus* main[3];

    main[0]=bus100;
    main[1]=bus200;
    main[2]=bus201;

    for(int i=0;i<10;i++)
    {  main[0]=&bus100[i];
       main[0]->displayBus();
       main[1]=&bus201[i];
       main[1]->displayBus();
       main[2]=&bus201[i];
       main[2]->displayBus();
    }
    */
    /*
    Bus* main[3];

    main[0]=*bus1;
    main[1]=*bus2;
    main[2]=*bus3;

    for(int i=0;i<10;i++)
    {  main[0]=bus1[i];
       main[0]->displayBus();
       main[1]=bus2[i];
       main[1]->displayBus();
       main[2]=bus3[i];
       main[2]->displayBus();
    }
    */
    int admin=10;
    string userName[]={"Ajay","Pruthvi","Surya","Pawan","Suma","Varun","Kushal","Karan","Nagaraj","Nayana"};
    string password[]={"Ajay123","@Pruthvi111","Surya@008","23Pawan#","Suma#777","VarunK98","Kushal345","Karan%234","Nagaraj@123","Nayana#666"};

   // userName[admin+1]={"vijay"};


    Branch hdbrts("BRTS014","CHIGARI","Hubli-Dharwad","Karnataka","2018",userName,password,st,bus1,bus2,bus3);

    int g=5;
    GreenBRTS g1("Phase1","2013-14",8000,"58 DifferentSchools/Institutions"),
              g2("Phase2","2014-15",4000,"Tapovana"),
              g3("Phase3","2015-16",4000,"STP,Nrupatunga Betta"),
              g4("Phase4","2016-17",2000,"Navalur Betta"),
              g5("Phase5","2018-19",9510,"Sanjivini Park, BRTScorridor's and other workspaces");

    GreenBRTS events[MAX]={g1,g2,g3,g4,g5};
    hdbrts.plantsPlanted=events;

    /*
    string a="Phase6";
    string b="2020";
    int c=10000;
    string d="Hubli";
    GreenBRTS g6(a,b,c,d);
    g6.displayGreenBRTS();
    */
    //CompanyEmployee c1(),

    //hdbrts.displayBranch();
    int c=15;
    CompanyEmployee c1("HD001","Bhuvan",12000,39,"Counterer","Hubli"),
                    c2("HD002","Ajit",18000,42,"Driver","Navalur"),
                    c3("HD003","Nikhil",20000,44,"Controller","Hubli"),
                    c4("HD004","Ashwath",12000,28,"Counterer","Dharwad"),
                    c5("HD005","Suresh",10000,27,"Driver","Garag"),
                    c6("HD006","Kiran",19000,33,"Driver","NavaNagar"),
                    c7("HD007","Girish",25000,54,"Counterer","Vijaypur"),
                    c8("HD008","Jagadeesh",22000,38,"Driver","Dharwad"),
                    c9("HD009","Praveen",12500,29,"Driver","Hubli"),
                    c10("HD010","Prakash",23000,38,"Driver","Hubli"),
                    c11("HD011","Kumar",24000,39,"Driver","Dharwad"),
                    c12("HD012","Sachin",14000,29,"Driver","Hubli"),
                    c13("HD013","Umesh",19000,39,"Driver","Hubli"),
                    c14("HD014","Sagar",21000,49,"Driver","Dharwad"),
                    c15("HD015","Suhas",20000,42,"Counterer","Hubli");

    CompanyEmployee ce[]={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15};
    hdbrts.compEmployees=ce;

    cout<<"------------------------------------------------------------------------------------------------------------------"<<endl;
    hdbrts.displayBranch(g,c,s,bb1,bb2,bb3);
    /*Individual display
    hdbrts.showBus(bb1,bb2,bb3);
    hdbrts.showGreenBRTS(g);
    hdbrts.showCompEmp(c);
    */
/*
    //Display Admins
    for(int i=0;i<admin;i++)
    {
        cout<<hdbrts.adminUN[i]<<":";
    }
*/

    int choice,choice2;
    cout<<"Enter category.............\n1-Passenger\n2-Admin\n3-View all Station\n4-View Required Station\n5-View GreenBRTS Event\n6-View Bus\n7-View Available Bus\n8-View Passenger Information System"<<endl;
    cin>>choice;

    switch(choice)
    {
        case 1:{cout<<"Welcome!.....Passenger....\nEnter choice\n1-Recharge smart Card\n2-Update smart card details\n3-Add as Passenger\n"<<endl;
               cin>>choice2;
               switch(choice2)
               {

                   case 1:{cout<<"Enter smart card details:"<<endl;
                           string hn1;
                           float amt;
                           cout<<"Enter Holder Name:"<<endl;
                           cin>>hn1;
                           cout<<"Enter Amount to recharge:"<<endl;
                           cin>>amt;
                           for(int i=0;i<32;i++)
                           {
                                if(scn[i].holderName==hn1)
                                     scn[i].rechargeSmartCard(amt);  //Only passenger
                           }

                          }break;
                    default:break;


               }
               }
               break;
        case 2:

            {  try{
               cout<<"Verification is needed!"<<endl;
               string un;
               string pw;
               cout<<"Enter UserName:"<<endl;
               cin>>un;
               cout<<"Enter Password:"<<endl;
               cin>>pw;
               int x=hdbrts.verifyAdmin(&un,&pw,admin);
               if(x==1)
               {
                 cout<<"Verified...Proceed"<<endl;
               }
               cout<<"Welcome!.....Admin....\nEnter choice\n1-Add bus100\n2-Display admin\n3-Display all Passenger\n4-Display Passenger in station\n5-Add new admin"<<endl;
               cin>>choice2;
               switch(choice2)
               {
                   case 1:{  bb1+=1;
                             int bn1,nos1,bl1,bc1;string bt1,src1,dst1,b100t1;
                             cout<<"Enter Bus details:"<<endl;
                             cout<<"BusNo:";cin>>bn1;
                             cout<<"BusType:";cin>>bt1;
                             cout<<"NoOfSeats:";cin>>nos1;
                             cout<<"BusCapacity:";cin>>bc1;
                             cout<<"BusLength:";cin>>bl1;
                             cout<<"Source:";cin>>src1;
                             cout<<"Destination:";dst1;
                             cout<<"Bus100Type:";cin>>b100t1;
                             Bus100 newb(bn1,bt1,nos1,bc1,bl1,src1,dst1,b100t1);
                             bus1[bb1-1]=newb;
                             for(int i=0;i<bb1;i++)
                             {
                               bus1[i].displayBus();
                             }

                  // (9,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D")

                          }break;
                   case 2:{  cout<<"........ADMINS OF HDBRTS BRANCH........"<<endl;
                             for(int i=0;i<admin;i++)
                              {
                                cout<<hdbrts.adminUN[i]<<":";
                              }
                          }break;
                   case 3:{
                           for(int i=0;i<32;i++)
                           {
                               for(int j=0;j<2;j++){
                                     st[i].passengers[j].displayPassenger();  //Only passenger
                               }
                           }

                           }break;
                   case 4:{ string w;
                            cout<<"Enter Station Name to be searched:Dharwad New Bus Stop"<<endl;
                            for(int i=0;i<32;i++)
                            {
                               for(int j=0;j<2;j++){
                                   if(st[i].stationName=="Dharwad New Bus Stop")
                                         st[i].passengers[j].displayPassenger();  //Only passenger

                                    }

                            }
                           }break;

                    case 5:{string user,pass;
                            cout<<"Enter admin Username:";cin>>user;
                            cout<<"Enter password:";cin>>pass;
                            admin+=1;
                            hdbrts.adminUN[admin-1]=user;
                            hdbrts.adminPW[admin-1]=pass;

                            for(int i=0;i<admin;i++)
                            {
                                cout<<hdbrts.adminUN[i]<<":";
                            }
                    }break;

                   default:break;
               }
               break;
              }
              catch(UserNamePasswordException upe)
              {
                  upe.displayAdminError();
              }
            }

        case 3:{hdbrts.showStation(s);
                          }break;
        case 4:{string sid;
                cout<<"Enter Station ID...Like ST01 or ST10:";
                cin>>sid;
                try{
                for(int j=0;j<s;j++)
                {
                 if(st[j].stationCode==sid)
                 {
                    st[j].displaySt();
                 }
                 else{
                    throw InvalidStationIDException(123,"Station Id not Found");
                 }
                }
                }
                catch (InvalidStationIDException isid)
                {
                    isid.displayStationIdError();
                }
              }break;
        case 5:{hdbrts.showGreenBRTS(g);

               }break;
        case 6:{
                 hdbrts.showBus(bb1,bb2,bb3);
               }break;
        case 7:{
               }break;

    }

    cout<<".......Created using Factory Design.........."<<endl;
    BusFactory *pBusFactory = new BusFactory();
    Bus * pBus = pBusFactory->getBus();
    pBus->displayBus();

    return 0;
}
