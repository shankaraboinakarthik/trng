class Tshirt{

    color:string="Red";

    material:string="Silk";

    design:string="Collar"

    constructor(i:string,n:string,s:string){

        this.color=i;

        this.material=n;

        this.design=s;

    }

    display()

    {

        console.log(this.color);

        console.log(this.material);

        console.log(this.design);

    }

}

var small=new Tshirt("Yellow","Polyster","Round");

small.display();

var large=new Tshirt("Orange","Cotton","Collar");

large.display();

var xs=new Tshirt("Black","Silk","V-Shaped");

xs.display();