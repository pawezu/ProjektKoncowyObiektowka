class III_DynamiczneLiczby {
  public int generuj(int min, int max) {
    int range = max - min + 1;
    return (int) ((System.currentTimeMillis() % range) + min);
 }
 
  public int generujZSzansą(int min, int max, int additionalChance, int targetValue) {
    int range = max - min + 1;
    int random = (int) ((System.currentTimeMillis() % range) + min);
        if (random <= targetValue) {
            random = random + (random * additionalChance / 100);
        }
    return random;
  }
}
