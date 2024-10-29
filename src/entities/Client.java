package entities;

import java.util.Objects;

import enums.Degree;

public class Client {

	private String name;
	private Boolean monthlyFeePaid;
	private Degree degree;

	public Client() {
	}

	public Client(String name, Boolean monthlyFeePaid, Degree degree) {
		this.name = name;
		this.monthlyFeePaid = monthlyFeePaid;
		this.degree = degree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getMonthlyFeePaid() {
		return monthlyFeePaid;
	}

	public void setMonthlyFeePaid(Boolean monthlyFeePaid) {
		this.monthlyFeePaid = monthlyFeePaid;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", degree=" + degree + ", monthlyFeePaid=" + monthlyFeePaid + "]";
	}
}