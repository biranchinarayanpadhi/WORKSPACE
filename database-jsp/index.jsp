<%@page import="java.sql.*"%>
<html>
    <head>
        <title>www.AppleBooks.com</title>
        <script language="javascript">
            function validate(objForm)
            {
                if(objForm.bookname.value.length==0)
                {
                    alert("PLease Enter book name");
                    objForm.bookname.focus();
                    return false;
                }
                if(objForm.price.value.length==0){
                    alert("please enter price");
                    objForm.price.focus();
                    return false;
                }
                return true;
            }
            </script>
            
    </head>
    
    <% 
      
        //server side begins
    
    if(request.getParameter("action")!=null)
    {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    Statement s=c.createStatement();
    ResultSet rs=null;
    
    String vbna=request.getParameter("bookname");
    int vprice=Integer.parseInt(request.getParameter("price"));
   String cmd="insert into books values((select max(bid)+1 from books),'"+vbna+"',"+vprice+")";
    s.executeUpdate(cmd);
    
    %>
    
    }
    <center><h2>BookList</h2>
    <table border="1">
    <tr><th>BookId</th><th>BookName</th>
        <th>Price</th></tr>
    
    <%
        rs=s.executeQuery("select *from books");
        while(rs.next()){
            %>
            <tr><td><%=rs.getString("bid")%></td>
               <td> <%=rs.getString("name")%></td>
               <td><%=rs.getString("price")%></td></tr>
            <%  }
rs.close();
s.close();
c.close();
%>
  <tr>
      </table>
  
  
  <a href="index.jsp">Back</a>
  </center>
  
<% }//end of server side code
else //client side operation begins
{
%> 
 <center>
     <form action="index.jsp" method="post" Onsubmit="return validate(this)">
         <input type="hidden" name="action" value="list">
         <table border="1">
             <tr><td colspan="2" align="center">
                     <h2>BookEntry Form</h2></td></tr>
             <tr><td colspan="2">&nbsp;</td></tr>
             <tr><td>BookName:</td>
                 <td><input name="bookname" type="text" size="20"></td>
                 </tr>
                 <tr><td>price:</td>
                     <td><input name="price" type="text" size="20"></td></tr>
                 <tr><tdcolspan="10" align="center">
                 <input type="submit" value="submit"></td>
                 </tr>
                 </table>
         </form>
 </center>
 <%
    }//end of client side
%>


                 
      
    
    </center>   
    </body>
            </html>