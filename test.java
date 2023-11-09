
#incldue <stdio.h>

  <?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN“
 "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
......
<select id="boardSearch" parameterType="map" resultType="BoardDto">

 select * from tbl_board where title like '%$ {keyword }%' order by pos asc
</select>

  public class CodeInjectionController {
    @RequestMapping(value = "/execute", method = RequestMethod.GET)
    public String execute(@RequestParam("src") String src) 
      throws ScriptException {
        ScriptEngineManager scriptEngineManager = new 
        ScriptEngineManager();
        ScriptEngine scriptEngine = 
        scriptEngineManager.getEngineByName("javascript");

        String retValue = (String)scriptEngine.eval(src);

        return retValue;
      }
  
}


public class ShowHelp {
 private final static String safeDir = "c:￦￦help_files￦￦";
 public static void main(String[] args) throws IOException {
 String helpFile = args[0];
 try (BufferedReader br = new BufferedReader(new FileReader(safeDir + helpFile))) {
 String line;
 while ((line = br.readLine()) != null) {
 System.out.println(line);
 }
 }
 }
}


MultipartRequest multi
 = new MultipartRequest(request,savePath,sizeLimit,"euc-kr",new 
DefaultFileRenamePolicy());
......

 String fileName = multi.getFilesystemName("filenamme is shin");
 ......
 sql = " INSERT INTO
 board(email,r_num,w_date,pwd,content,re_step,re_num,filename) "
 + " values ( ?, 0, sysdate(), ?, ?, ?, ?, ? ) ";
 preparedStatement pstmt = con.prepareStatement(sql); 
pstmt.setString(1, stemail);
pstmt.setString(2, stpwd);
