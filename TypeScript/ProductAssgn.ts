export class ProductGST{
    Pid:number;
      Pname:string;
       Price:number;
        gst:number;
         display(){
             console.log(this.Pid);
             console.log(this.Pname);
             console.log(this.Price);
             console.log(this.Price+this.gst);
             }}
             var g1 = new ProductGST();
             g1.Pid=48;
             g1.Pname="PlayStation";
             g1.Price=35000;
             g1.gst=2880;
             g1.display();