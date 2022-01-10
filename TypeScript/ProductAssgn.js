"use strict";
exports.__esModule = true;
exports.ProductGST = void 0;
var ProductGST = /** @class */ (function () {
    function ProductGST() {
    }
    ProductGST.prototype.display = function () {
        console.log(this.Pid);
        console.log(this.Pname);
        console.log(this.Price);
        console.log(this.Price + this.gst);
    };
    return ProductGST;
}());
exports.ProductGST = ProductGST;
var g1 = new ProductGST();
g1.Pid = 48;
g1.Pname = "PlayStation";
g1.Price = 35000;
g1.gst = 2880;
g1.display();
