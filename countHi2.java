public int countHi2(String str) {
  if(str.length() < 2)
    return 0;
  else if(str.substring(0,2).equals("hi"))
    return 1 + countHi2(str.substring(2));
  else if(str.substring(0,2).equals("xh"))
    return countHi2(str.substring(2));
  return countHi2(str.substring(1));
}
