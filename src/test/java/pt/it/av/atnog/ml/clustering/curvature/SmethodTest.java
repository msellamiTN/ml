package pt.it.av.atnog.ml.clustering.curvature;

import org.junit.Test;

public class SmethodTest {
  @Test
  public void test_elbow() {
    Curvature alg = new Smethod();
    int elbow = alg.elbow(CurvatureTest.elbow_x, CurvatureTest.elbow_y);
    //assertTrue(elbow == 3);
    System.out.println(elbow);
  }

  @Test
  public void test_knee() {
    Curvature alg = new Smethod();
    int knee = alg.knee(CurvatureTest.knee_x, CurvatureTest.knee_y);
    //assertTrue(knee == 5);
    System.out.println(knee);
  }
}
