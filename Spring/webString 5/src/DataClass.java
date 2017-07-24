import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by randhir on 8/7/17.
 */
public class DataClass
{
     private List<Complex> complexList;
     private Set<Complex> complexSet;

    public List<Complex> getComplexList() {
        return complexList;
    }

    public void setComplexList(List<Complex> complexList) {
        this.complexList = complexList;
    }

    public Set<Complex> getComplexSet() {
        return complexSet;
    }

    public void setComplexSet(Set<Complex> complexSet) {
        this.complexSet = complexSet;
    }

    public Map<String, Complex> getComplexMap() {
        return complexMap;
    }

    public void setComplexMap(Map<String, Complex> complexMap) {
        this.complexMap = complexMap;
    }

    private Map<String,Complex> complexMap;
    public void listDisplay()
    {
        for(Complex complex:complexList)
        {
            System.out.println(complex.getImag()+"  "+complex.getReal());
        }
    }
    public void  setDiaply()
    {
        for(Complex complex:complexSet)
        {
            System.out.println(complex.getImag()+"   "+complex.getReal());
        }
    }

}
