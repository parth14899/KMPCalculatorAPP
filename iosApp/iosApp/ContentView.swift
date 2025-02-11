import SwiftUI
import shared

struct ContentView: View {
	let calculator = Calculator()
 let sum = calculator.add(a: 10.0, b: 5.0)
        let difference = calculator.subtract(a: 10.0, b: 5.0)
        let product = calculator.multiply(a: 10.0, b: 5.0)
        let quotient = calculator.divide(a: 10.0, b: 5.0)
        let square = calculator.square(a: 10.0)

        print("Sum: \(sum)")
        print("Difference: \(difference)")
        print("Product: \(product)")
        print("Quotient: \(quotient)")
        print("Square: \(square)")

	}


struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}