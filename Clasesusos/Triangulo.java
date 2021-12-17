package Clasesusos;

public class Triangulo {
	// atributos por cada atributo un getters y setters
	private double ladoa;
	private double base;
	private double ladoc;
	private double altura;
	private boolean equilatero = false;
	private boolean isosceles = false;
	private boolean escaleno = false;
	private double area;
	private double perimetro;

	// constructor
	public Triangulo() {
	}

	public Triangulo(double ladoa, double base, double ladoc) {
		this.ladoa = ladoa;
		this.base = base;
		this.ladoc = ladoc;
		this.perimetro = ladoa + base + ladoc;
		if (isEquilatero()) {
			this.altura = (Math.sqrt(3) * ladoa) / 2;
		} else if (isIsosceles()) {
			this.altura = (Math.sqrt(Math.pow(ladoa, 2) - (Math.pow(base, 2) / 4)));
		} else if (isEscaleno()) {
			double s = (ladoa + base + ladoc) / 2;
			this.altura = 2 / base * (Math.sqrt(s * (s - ladoa) * (s - base) * (s - ladoc)));
			if (altura == 0) {
				System.out.println("Ese triangulo no existe, es una recta");
			}
		}
		this.area = this.isArea();

	}

	public double getLadoa() {
		return this.ladoa;
	}

	public double getbase() {
		return this.base;
	}

	public double getLadoc() {
		return this.ladoc;
	}

	public double getAltura() {
		return this.altura;
	}

	public double getArea() {
		return this.area;
	}

	public boolean isEquilatero() {
		if (ladoa == base && ladoa == ladoc) {
			equilatero = true;
		}
		return equilatero;
	}

	public boolean isIsosceles() {
		if ((ladoa == base && ladoa != ladoc) || (ladoc == base && ladoa != ladoc)
				|| (ladoa == ladoc && ladoa != base)) {
			isosceles = true;
		}
		return isosceles;
	}

	public boolean isEscaleno() {
		if (ladoa != base && ladoa != ladoc && base != ladoc) {
			escaleno = true;
		}
		return escaleno;
	}

	public double isArea() {
		this.area = (base * altura) / 2;
		return area;
	}

	public double isPerimetro() {
		return perimetro;
	}
}
