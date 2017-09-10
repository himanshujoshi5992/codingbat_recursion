public boolean strCopies(String str, String sub, int n) {
  int len = sub.length();
  if(n < 0)
    return false;
  if(str.length() < len && n > 0)
    return false;
  if(str.length() < len && n == 0)
    return true;
  else if(str.substring(0,len).equals(sub)) {
    n--;
    if(n >= 0)
      return strCopies(str.substring(1),sub,n);
    else
      return false;    
  }
  if(n >= 0)
    return strCopies(str.substring(1),sub,n);
  else
    return false;
}
