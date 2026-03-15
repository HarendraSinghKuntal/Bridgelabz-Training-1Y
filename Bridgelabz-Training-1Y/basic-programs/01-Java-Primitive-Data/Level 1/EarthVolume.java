class EarthVolume {
    public static void main(String[] args) {
        double radiusKms = 6378;
        double p = 3.14159;
        double volumeKms = (4.0 / 3.0) * p * radiusKms * radiusKms * radiusKms;
        double radiusMiles = radiusKms / 1.6;
        double volumeMiles = (4.0 / 3.0) * p * radiusMiles * radiusMiles * radiusMiles;
        System.out.println("The volume of Earth in cubic Kms is: " + volumeKms +
                " and cubic Miles is: " + volumeMiles);
    }
}
