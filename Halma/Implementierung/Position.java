public class Position{
	
	private Integer x;
	private Integer y;
	
	public Position(){
		x = new Integer(0);
		y = new Integer(0);
	}
	
	public Position(Integer x, Integer y){
		this.x = new Integer(x.intValue());
		this.y = new Integer(y.intValue());
	}
	
	public Integer getX(){
		return x;
	}
	
	public Integer getY(){
		return y;
	}
	
	public void setX(Integer x){
		this.x = new Integer(x.intValue());
	}
	
	public void setY(Integer y){
		this.y = new Integer(y.intValue());
	}
}