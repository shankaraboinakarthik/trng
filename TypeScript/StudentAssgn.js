var StudentTask = /** @class */ (function () {
    function StudentTask(i, n, s) {
        this.SID = 4;
        this.SName = "Karthik";
        this.SClass = 2;
        this.SID = i;
        this.SName = n;
        this.SClass = s;
    }
    StudentTask.prototype.display = function () {
        console.log(this.SID);
        console.log(this.SName);
        console.log(this.SClass);
    };
    return StudentTask;
}());
var s1 = new StudentTask(10, "Vishal", 9);
s1.display();
var s2 = new StudentTask(15, "Ramu", 11);
s2.display();
