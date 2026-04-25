x,y,a,b = gets.split.map(&:to_i)
puts [(y-x).abs,(x-a).abs+(y-b).abs,(x-b).abs+(y-a).abs].min