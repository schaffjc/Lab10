class Cookie {
  int numCookies;
  int bakeTemp;
  int bakeMinutes;
  boolean isBaked;

  Cookie() {
    numCookies = 0;
    bakeTemp = 0;
    bakeMinutes = 0;
    isBaked = false;
  }

  Cookie(int aNumCookies, int aBakeTemp, int aBakeMinutes) {
    numCookies = aNumCookies;
    bakeTemp = aBakeTemp;
    bakeMinutes = aBakeMinutes;
    isBaked = false;
  }

  boolean getIsBaked() {
    return isBaked;
  }

  void setNumCookies(int aNumCookies){
    numCookies = aNumCookies;
  }

  void bakeCookies (int aBakeTemp, int aBakeMinutes) {
    System.out.println("The cookies were baked at " + aBakeTemp + " degrees F for " + aBakeMinutes + " minutes");
    isBaked = true;
  }
}