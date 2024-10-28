package bmc;

public class Circle
{
	float r;

	public Circle(float r)
	{
		this.r = r;
	}

	public float getArea()
	{
		return 3.14f * r * r;
	}
}