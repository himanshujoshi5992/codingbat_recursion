public int strCount(String str, String sub) {
  int len = sub.length();
  if(str.length() < len)
    return 0;
  else if(str.substring(0,len).equals(sub))
    return 1 + strCount(str.substring(len),sub);
  return strCount(str.substring(1),sub);
}
