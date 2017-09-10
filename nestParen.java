public boolean nestParen(String str) {
  if(str.length() == 0)
    return true;
  else if(str.length() == 1)
    return false;
  else if(str.charAt(0) == '(') {
    if(str.charAt(str.length()-1) == ')')
      return true && nestParen(str.substring(1,str.length()-1));
    return nestParen(str.substring(0,str.length()-1));
  }
  return nestParen(str.substring(1));
}
