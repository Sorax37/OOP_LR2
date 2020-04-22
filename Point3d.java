import java.lang.*;

public class Point3d extends Point2d{

    private Double zCoord;

    public Point3d(Double x, Double y, Double z)
    {
        super(x,y);
        zCoord = z;
    }

    public Point3d()
    {
        super(0.0, 0.0);
        zCoord = 0.0;
    }

    public Double getZ()
    {
        return zCoord;
    }

    public void setZ(Double val)
    {
        zCoord = val;
    }

    public boolean comparison(Point3d A)
    {
        if ((this.getX().equals(A.getX())) && (this.getY().equals(A.getY())) && (this.getZ().equals(A.getZ()))) return true;
        else return false;
    }


    public Double distanceTo(Point3d A)
    {
        double d = Math.sqrt(Math.pow((this.xCoord - A.xCoord), 2) + Math.pow((this.yCoord - A.yCoord),2) + Math.pow(this.zCoord - A.zCoord, 2));
        d = d * 100;
        int i = (int) Math.round(d);
        d = (double)i / 100;
        return (d);
    }


}
