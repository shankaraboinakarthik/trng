class StudentTask{
    SID:number=4;
    SName:string="Karthik";
    SClass:number=2
    constructor(i:number,n:string,s:number){
           this.SID=i;
           this.SName=n;
            this.SClass=s;
           }
           display()
            {
                 console.log(this.SID);
                 console.log(this.SName);
                 console.log(this.SClass);
                  }}
                 var s1=new StudentTask(10,"Vishal",9);
                 s1.display();
                 var s2=new StudentTask(15,"Ramu",11);
                 s2.display();