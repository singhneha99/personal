package package1;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBucketCount(3.4,2.1,1.5,2);
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        int totalNumberOfBuckets = 0;
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<=0)
        {
            return -1;
        }
        else
        {
            totalNumberOfBuckets = (int)(Math.ceil(((width*height)/areaPerBucket))) ;
            //+ extraBuckets;
        }
        return totalNumberOfBuckets;
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        int numberOfBuckets = 0;
        if(width<=0 || height<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            numberOfBuckets = (int)(Math.ceil((width*height)/areaPerBucket));
        }
        return numberOfBuckets;
    }
    
    public static int getBucketCount(double area, double areaPerBucket)
    {
        int numberOfBuckets = 0;
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        else
        {
            numberOfBuckets = (int)(Math.ceil(area/areaPerBucket));
        }
        return numberOfBuckets;
    }
}
